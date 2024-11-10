package lesson20.HomeWork20.ListDevice

import lesson20.HomeWork20.*

abstract class Fridge (brand :String) : Powerable,
    Openable,
    TemperatureRegulatable,
    Mechanical,
    SoundEmitting,
    Movable
{}