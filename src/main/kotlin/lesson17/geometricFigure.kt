package lesson17

open class GeometFigure (
val numberCorners : Int

)

open class Polygon (
    numberCorners: Int,
    val width: Int
) : GeometFigure( numberCorners)

open class  Cirle (
    numberCorners: Int,
    width: Int,
    val radius : Int
) : GeometFigure(numberCorners = 0)

open class Triangle(
    numberCorners: Int,
    width: Int,
    val counterSide : Int
) :Polygon(numberCorners, width)

open class  Quadrilateral (
    numberCorners: Int,
    width: Int,
    val hight : Int
) : Polygon(numberCorners, width)


