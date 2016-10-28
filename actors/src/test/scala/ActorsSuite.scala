package Actors

import akka.actor.{ActorSystem}
import akka.testkit.{TestActorRef, TestKit, TestProbe}
import org.scalatest.FunSuiteLike

class ActorsSuite extends TestKit(ActorSystem("testSystem")) with FunSuiteLike {
}
