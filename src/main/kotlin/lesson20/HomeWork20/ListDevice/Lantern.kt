package lesson20.HomeWork20.ListDevice

import lesson20.HomeWork20.*

abstract  class Lantern (brand :String): Powerable, AutomaticShutdown, Timable, Mechanical,
    LightEmitting, Programmable, SoundEmitting, BatteryOperated, Rechargeable {
}