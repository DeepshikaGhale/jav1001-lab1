fun main(){
    print("Please enter a number:")

    var input = readLine()
    var inputNumber = input!!.toFloat()


    print("Enter unit of measurement:")
    var unitOfMeasurement = readLine()

    var inputData = "$inputNumber$unitOfMeasurement"
    print(inputData)
}