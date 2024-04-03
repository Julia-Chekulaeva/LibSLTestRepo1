package org.example

import org.yaml.snakeyaml.Yaml
import java.io.File

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
    println(data)
}