package lesson17

open class furniture (
    val price :Int,
    val namesFurniture: String,
    val transformers : String,
    val materialls :String
)

open class Sofa (
    price: Int,
    namesFurniture: String,
    transformers: String,
    materialls: String,
    val counterLegs : Int,
    val counerPocket: Int
):furniture(price,namesFurniture,transformers="Yes",materialls="Wood")
open class armchair(
    price: Int,
    namesFurniture: String,
    transformers: String,
    materialls: String,
    val counterPillows: Int
) : furniture (price,namesFurniture,transformers,materialls)
