import React, {Component} from 'react';
import PropTypes from 'prop-types';
import { requireNativeComponent, View, NativeModules, findNodeHandle } from 'react-native';
import FaceModule from './FaceModule';


let iface = {
    propTypes: {
        ...View.propTypes, // include the default view properties
        foo: String
    }
};

let DaonViewManager = requireNativeComponent('DaonFaceManager', iface);
console.log('DaonFaceManager: ', DaonViewManager);

class DaonFaceView extends Component {
    state = {
        loaded: false
    };
    
    componentDidMount() {
        FaceModule.loadFragment();
    }

    render() {
        return (
            <DaonViewManager {...this.props} />
        );
    }
}

export {DaonFaceView};
