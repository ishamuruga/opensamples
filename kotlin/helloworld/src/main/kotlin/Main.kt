package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
 var name="virtusa"

 val vin:String = "1234567890"
 println(vin)

 println(4+5)

 var cname = "Virtusa Consulting"

 print(cname.plus(" Consulting Pvt Ltd"))

 var sb = StringBuilder().append("Virtusa").append(" Consulting").append(" Pvt Ltd")

 println(sb.toString())

 StringBuilder().apply {
  append("Virtusa")
  append(",")
  append("Consulting")
 }.toString().also { println(it) }

var paragraph = """
    |Virtusa Consulting Pvt Ltd
    |Virtusa
    |Consulting
    |Pvt Ltd
"""

 for ( c in paragraph){
//  print(c)
 }

 var cname2 = "Super Star Rajinikanth"
 println(cname2[2])

 cname2.forEach { x->println(x) }

}