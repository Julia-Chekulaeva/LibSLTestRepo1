package org.example

import org.yaml.snakeyaml.Yaml

fun main() {
    for (i in 0 until 10) {
        val yaml = Yaml()
        yaml.name = "MyYaml"
        println(yaml.name)
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
        val inputStream = content.byteInputStream()
        for (j in 0 until i) {
            val map = yaml.load<Map<String, Any>>(inputStream)
            yaml.dump(map)
            val str = yaml.load<String>(inputStream)
            yaml.dump(str)
        }
        val data: Map<String, Any> = yaml.load(inputStream)
        yaml.dump(data)
        val strData = yaml.dump(data)
        println("data.toString() = $data")
        println("yaml.dump(data) = $strData")
    }
}