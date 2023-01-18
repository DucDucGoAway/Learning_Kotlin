open class SmartDevice(val name: String, val category: String) {
    
    var deviceStatus = "online"
    
    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
    	deviceStatus = when(statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
    
    open fun turnOn() {
        println("The Smart device is turned on")
    }
    open fun turnOff() {
        println("The Smart device is turned off")
    }
    
}

class SmartTv(deviceName: String, deviceCategory: String) :
	SmartDevice(name = deviceName, category = deviceCategory) {
        
        var speakerVolume = 2
        	set(value) {
                if (value in 0..100) {
                    field = value
                }
            }
      	var channelNumber = 1
        	set (value) {
                if (value in 0..200) {
                    field = value
                }
            }
            
        override fun turnOn() {
            deviceStatus = "on"
            println("$name is turned on. Speaker volume is set to $speakerVolume and channel number is set to $channelNumber.")
        }
        
        override fun turnOff() {
            deviceStatus = "off"
            println("$name is turned off")
        }
        
       	fun increaseSpeakerVolume() {
            speakerVolume++
            println("speaker volume increased to $speakerVolume")
        }
       	fun nextChannel() {
            channelNumber++
            println("Channel set to $channelNumber")
        }   
    }
    
class SmartLight(deviceName: String, deviceCategory: String):
	SmartDevice(name = deviceName, category = deviceCategory) {
        
        var brightnessLevel = 0
        	
        override fun turnOn() {
            deviceStatus = "on"
            brightnessLevel = 2
            println("$name turned on. The brightness level is $brightnessLevel.")
        }
        override fun turnOff() {
            deviceStatus = "off"
            brightnessLevel = 0
            println("Smart Ligh turned off")
        }
        
       	fun increaseBrightness() {
            brightnessLevel++
            println("Brightness increased to $brightnessLevel")
        }
        
        
class SmartHome(
    val smartTv: SmartTv,
    val smartLight: SmartLight
) {
    
    fun turnOnTv() {
        smartTv.turnOn()
    }
    fun turnOffTv() {
        smartTv.turnOff()
    }
    fun increaseTvVolume() {
        smartTv.increaseSpeakerVolume()
    }
    fun changeTvChannelToNext() {
        smartTv.nextChannel()
    }
    fun turnOnLight() {
        smartLight.turnOn()
    }
    fun turnOffLight() {
        smartLight.turnOff()
    }
    fun increaseLightBrightness() {
        smartLight.increaseBrightness()
    }
    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }
}        
        
        
        
        
    }

fun main() {
    var smartDevice: SmartDevice = SmartTv("Android TV", "Entertainment")
    smartDevice.turnOn()
}






https://developer.android.com/codelabs/basic-android-kotlin-compose-classes-and-objects?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-classes-and-objects#6
https://developer.android.com/courses/android-basics-compose/unit-2
https://developer.android.com/courses/android-basics-compose/course
