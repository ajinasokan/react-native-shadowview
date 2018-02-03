
# React Native Shadow View

## Getting started

`$ npm install react-native-shadowview --save`

### Mostly automatic installation

`$ react-native link react-native-shadowview`

### Manual installation

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.innoventionist.rnshadowview.RNShadowViewPackage;` to the imports at the top of the file
  - Add `new RNShadowViewPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-shadowview'
  	project(':react-native-shadowview').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-shadowview/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-shadowview')
  	```

## Usage
```javascript
import ShadowView from 'react-native-shadowview';


```
  