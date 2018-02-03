
# React Native Shadow View

## Install

With Yarn:

`$ yarn add ajinasokan/react-native-shadowview`

With NPM:

`$ npm install ajinasokan/react-native-shadowview --save`

## Link

### Automatic linking

`$ react-native link react-native-shadowview`

### Manual linking (only for Android)

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

<ShadowView
	shadowColor={'#7fd5d5d5'} 
	shadowRadius={10} 
	shadowAngle={90}>

	<View style={{ 
		height: 200,
		width: 200,
		borderRadius: 100,
		backgroundColor: '#ffffff',
		justifyContent: 'center',
		alignItems: 'center' }}>
		<Text style={styles.instructions}>
			To get started, edit App.js
		</Text>
	</View>
</ShadowView>
```
  