package Actors

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

object Actors extends App {
  val system = ActorSystem("PingPongSystem")
  system.shutdown()
}
