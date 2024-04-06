package org.example

import org.yaml.snakeyaml.Yaml

fun main() {
    val yaml = Yaml()
    val content = """
A:
  B: 8
  C:
    D:
      - E1: "abc"
        F1: abc
      - E2: "abc"
        F2: abc
    G: 6
"""
    val inputStream = content.byteInputStream()//File("src/resources/ex1.yaml").inputStream()
    val data: Map<String, Any> = yaml.load(inputStream)
    val strData = yaml.dump(data)
    println("data.toString() = $data")
    println("yaml.dump(data) = $strData")
}