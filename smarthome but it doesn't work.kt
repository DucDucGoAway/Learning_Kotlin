Solutions
Docs
Community
Teach
Play

1.8.0
JVM

Copy link
Share code
Run

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty
​
open class SmartDevice(val name: String, val category: String) {
    
    var deviceStatus = "online"
        protected set
    
    open val deviceType = "unknown"
    
    open fun turnOn() {
        deviceStatus = "on"
    }
    open fun turnOff() {
        deviceStatus = "off"
    }
    
}
​
class SmartTv(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {
        
        override val deviceType = "Smart TV"
        
        private var speakerVolume by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)
            
        private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)
            }
            
        override fun turnOn() {
            super.turnOn()
            println("$name is turned on. Speaker volume is set to $speakerVolume and channel number is set to $channelNumber.")
        }
        
        override fun turnOff() {
            super.turnOff()
            println("$name is turned off")
        }
        
        fun increaseSpeakerVolume() {
            speakerVolume++
            println("speaker volume increased to $speakerVolume")
        }
        protected fun nextChannel() {
            channelNumber++
            println("Channel set to $channelNumber")
        }   
    }
    
class SmartLight(deviceName: String, deviceCategory: String):
    SmartDevice(name = deviceName, category = deviceCategory) {
        
        override val deviceType = "Smart Light"
        
        private var brightnessLevel by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)
            
        override fun turnOn() {
            super.turnOn()
            brightnessLevel = 2
            println("$name turned on. The brightness level is $brightnessLevel.")
        }
        override fun turnOff() {
            super.turnOff()
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
    var deviceTurnOnCount = 0
        private set
    
    fun turnOnTv() {
        deviceTurnOnCount++
        smartTv.turnOn()
    }
    fun turnOffTv() {
        deviceTurnOnCount--
        smartTv.turnOff()
    }
    fun increaseTvVolume() {
        smartTv.increaseSpeakerVolume()
    }
    fun changeTvChannelToNext() {
        smartTv.nextChannel()
    }
    fun turnOnLight() {
        deviceTurnOnCount++
        smartLight.turnOn()
    }
    fun turnOffLight() {
        deviceTurnOnCount--
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
        
class RangeRegulator(
    initalValue: Int
    private val minValue: Int
    private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {
    
    var fieldData = initialValue
    
    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }
    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue) {
            fieldData = value
        }
    }
}        
        
        
    }
​
fun main() {
    smartHome.turnOnTv()
    smartHome.turnOnLight()
    println("Total number of devices currently turned on: ${smartHome.deviceTurnOnCount}")
    println()
​
    smartHome.increaseTvVolume()
    smartHome.changeTvChannelToNext()
    smartHome.increaseLightBrightness()
    println()
​
    smartHome.turnOffAllDevices()
    println("Total number of devices currently turned on: ${smartHome.deviceTurnOnCount}.")
}
​
​
​
​
​
/*
https://developer.android.com/codelabs/basic-android-kotlin-compose-classes-and-objects?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-classes-and-objects#6
https://developer.android.com/courses/android-basics-compose/unit-2
https://developer.android.com/courses/android-basics-compose/course
*/
