fun main() {
    var amount = 1000000
    val commission = amount / 100 * 0.75
    val result: Int
    result = if (commission < 3500)
        amount + 3500
    else
        amount + commission.toInt()

    println(result)
}