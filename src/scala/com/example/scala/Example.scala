package com.example.scala

import akka.http.scaladsl.ClientTransport
import akka.http.scaladsl.model.Uri.ParsingMode
import packaaaa.src.scala.infra.Infra

object Example extends App {
  println(classOf[ClientTransport].getName)
  println("This is just an example...")

  println(Infra.Text)

  println(classOf[ParsingMode].getName())
}
