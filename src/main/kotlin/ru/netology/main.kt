package ru.netology

//граничная сумма для проверки 4666, дальше комиссия будет больше 35 рублей
fun main(){
    val amount: Int = 10000 //сумма перевода в рублях
    val commissionRate: Int = 75 //комиссия в сотых процента
    val minCommission: Int = 35 //минимальная комиссия в рублях
    val commissionPreview = amount * commissionRate / 10000 //комиссия для сравнения с минимальной суммой


    val commissionResult = if (commissionPreview < minCommission) minCommission else commissionPreview

    println(commissionResult)
}