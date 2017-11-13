/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  Platform,
  StyleSheet,
  Text,
  View
} from 'react-native';
import { DaonFaceView } from './components/DaonFaceView';

// const instructions = Platform.select({
//   ios: 'Press Cmd+R to reload,\n' +
//     'Cmd+D or shake for dev menu',
//   android: 'Double tap R on your keyboard to reload,\n' +
//     'Shake or press menu button for dev menu',
// });

export default class App extends Component<{}> {
  render() {
     // return <DaonFaceView style={styles.container}/>;//(
     return (
      <View style={styles.container}>
        <DaonFaceView style={{
          height: 200,
          width: 200,
          backgroundColor: 'white'
        }}/>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'red',
    justifyContent: 'center',
    alignItems: 'center',
  },
  welcome: {
     flex: 1,
     justifyContent: 'center',
     alignItems: 'center',
     position: 'absolute',
  },

});
