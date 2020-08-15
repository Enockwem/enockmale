import java.io.File
import java.sql.Array

//Write a program that prints all numbers between 1 and 574 that follow
//this pattern:
//1, 2, 5, 6, 9, 10, 13, 14, 17, 18, 21, 22, 25, 26, ...

//function that prints an array of all the number from 1 - 154 in 1,2,5,6,9......
//Using arrays

fun allNumbersBtn1_547(): IntArray {
    var addNumberOne = {t:Int -> t + 1}
    var addNumberthree = {t:Int -> t + 3}
    var arr = IntArray(77)
    for (i in 0 until arr.size){
        if (i < 2){
            arr[i] = addNumberOne(i)
        }else{
            if(arr[i-1] - arr[i-2] == 1){
                arr[i] = addNumberthree(arr[i-1])
            }else if (arr[i-1] - arr[i-2] == 3){
                arr[i] = addNumberOne(arr[i-1])
            }
        }
    }
    return arr
}
/*
 The numbers should be printed 3 pairs per line with a dash in each pair,
 that is:
 1-2, 5-6, 9-10
 13-14, 17-18, 21-22
 25-26, ...
  */
fun printing3Numbers(alist: IntArray){
    for (i in 0..alist.size-1){
        if (i == 0){
            print(alist[0])
            print("-")
        }else{
            if (i%2==0){
                if (i == alist.size-1){
                    print(",")
                    print(alist[i])
                }else{
                    print(",")
                    print(alist[i])
                    print("-")
                }
            }else if(i%5 == 0){
                    print(alist[i])
                    print("\n")
            }
                else{
                    print(alist[i])
                }
            }
        }
    }

//Question Two
//You a given a list of sorted counting numbers starting from 1 but there
//is one missing number. Write a function that finds and returns that
//missing number.
//Your function should accept a list of integers and from that list it
//should look for the missing integer.
//For example:
//finder(listOf(1, 3, 4)) returns 2.
//finder(listOf(1, 2, 3, 5, 6)) returns 4.
//finder(listOf(1, 2, 3, 4, 5, 6, 7, 9)) returns 8.
//main function printing all the numbers in style 1,2,5,6,9,10,13....

fun finder(alist: List<Int>): Int{
    var k = 0
    for (i in 0 until alist.size){
        if (i == 0)
            continue
        else{
            if (alist[i] - alist[i-1] == 1)
                continue
            else
                k = alist[i-1] + 1
        }
    }
    return k
}
fun main(){
    for (i in 0..allNumbersBtn1_547().size-1){
        var k = allNumbersBtn1_547()[i]
        print("$k,")
    }
    print("\n")
    printing3Numbers(allNumbersBtn1_547())
    print("\n")
    print(finder(listOf(1,3,4)))
    print("\n")
    print(finder(listOf(1,2,3,5,6)))
    print("\n")
    print(finder(listOf(1,2,3,4,5,6,7,9)))
}