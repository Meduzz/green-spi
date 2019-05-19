name := "green-spi"

version := "201905019"

scalaVersion := "2.12.8"

organization := "se.chimps.green"

credentials += Credentials(Path.userHome / ".ivy2" / ".green")

publishTo := Some("se.chimps.green" at "https://yamr.kodiak.se/maven")

publishArtifact in (Compile, packageDoc) := false
