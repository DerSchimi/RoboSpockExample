**Travis CI Build:** [![Build Status](https://travis-ci.org/DerSchimi/RoboSpockExample.svg?branch=master)

RoboSpockExample
================
This is a simplified App Library Setup I use for some of my apps (ex: Battery Temperature guard: http://goo.gl/36srQ2).
My Android App Setup uses gradle to build an android library project. 

### AppLibrary
These Files are inside the folder [AppLibrary](https://github.com/DerSchimi/RoboSpockExample/tree/master/App).
This AppLibrary is a simple setup for a generic android app using an ActionbarActivity. 
I tried to simplify it as much as possible.
This android-library conains a few other depenencies like appcompat, aquery...

### Example App
The App itself is inside the folder [App](https://github.com/DerSchimi/RoboSpockExample/tree/master/App).

This App uses AppLibrary to quickly build an android app with two simple Fragments.

### Tests
The folder [AppTests](https://github.com/DerSchimi/RoboSpockExample/tree/master/AppTests) contains some RoboSpock setup. I try to use RoboSpock as a simple test framework for my Android App, but I can't get get the tests running).




My Software Setup
=================
- Gradle 1.10
- IntelliJ IDEA 13.1.5




