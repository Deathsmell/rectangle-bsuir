class Rectangle() {
    var width = 0F
        set(value) {
            field = getPositiveValue("width", value)
        }

    var height = 0F
        set(value) {
            field = getPositiveValue("height", value)
        }

    constructor(width: Float, height: Float) : this() {
        this.width = width
        this.height = height
    }

    constructor(width: Int, height: Int) : this(width.toFloat(), height.toFloat())

    fun isSquare(): Boolean = isSidesInitialised() && width == height

    fun getPerimeter(): Float = if (isSidesInitialised()) (width + height) * 2 else 0F

    fun getArea(): Float = width * height

    private fun isSidesInitialised(): Boolean = width != 0F && height != 0F

    private fun getPositiveValue(side: String, value: Float): Float = if (value < 0F) {
        print("$side value must be positive")
        0F
    } else value

    override fun toString(): String {
        return """
            width: $width
            height: $height
            is square: ${isSquare()}
            perimeter: ${getPerimeter()}
            area: ${getArea()}
        """.trimIndent()
    }
}