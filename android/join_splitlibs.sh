#!/bin/bash

SCRIPT_DIR="$( cd "$( dirname "$0" )" && pwd )/"

echo Joining com.daon.sdk.face.rec-2.1.1.aar
cat $SCRIPT_DIR/splitlibs/com.daon.sdk.face.rec-2.1.1.aar.* > $SCRIPT_DIR/fidolibs/com.daon.sdk.face.rec-2.1.1.aar

echo Joining com.daon.sdk.faceauthenticator-0203-1.0.11.aar
cat $SCRIPT_DIR/splitlibs/com.daon.sdk.faceauthenticator-0203-1.0.11.aar.* > $SCRIPT_DIR/fidolibs/com.daon.sdk.faceauthenticator-0203-1.0.11.aar

echo Joining EyeprintID.aar
cat $SCRIPT_DIR/splitlibs/EyeprintID.aar.* > $SCRIPT_DIR/fidolibs/EyeprintID.aar
