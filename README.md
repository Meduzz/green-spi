# Green-SPI
A green spi, for those moments of extendability.

## What's SPI?
SPI (service provider interface) which is a way of "sort of auto discover" implementations of an interface.

## Status
Atm the only SPI in the Green arsenal, is the [Discovery](https://github.com/Meduzz/green-spi/blob/master/src/main/scala/se/chimps/green/spi/Discovery.scala) interface. It is roughly modeled after consuls capabilities.

## Get started implementing discovery

In you ```build.sbt``` you need to add:

> resolvers += "se.chimps.green" at "https://yamr.kodiak.se/maven"

You also needs to (base your app on Scala 2.12 and) add:

> libraryDependencies += "se.chimps.green" %% "green-spi" % "20190519"

You also needs to follow the SPI spec, but you can look that up your self.