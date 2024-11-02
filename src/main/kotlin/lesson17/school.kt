package lesson17

import org.w3c.dom.css.Counter

open class EducationInstitute (
val number: Int,
    val name : String,
    val adress : String,
    val privateSchool : String
)
open class school5 (
    number: Int,
    name: String,
    adress: String,
    privateSchool: String,
    var numbersChilds : Int
): EducationInstitute(number, name, adress, privateSchool = "No")

open class Hogwarts (
    number:Int,
    name: String,
    adress: String,
    privateSchool: String,
    val magicShcool : String,
    val counterHouse : Int
) :EducationInstitute(number,name,adress,privateSchool)
