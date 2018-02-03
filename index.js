
import PropTypes from 'prop-types'
import {
	View,
	requireNativeComponent
} from 'react-native'

export default requireNativeComponent('ShadowView', {
	name: 'ShadowView',
	propTypes: {
		shadowColor: PropTypes.string,
		shadowRadius: PropTypes.number,

		shadowAngle: PropTypes.number,
		shadowDistance: PropTypes.number,
		
		...View.propTypes
	}
})

