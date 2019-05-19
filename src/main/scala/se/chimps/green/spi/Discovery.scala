package se.chimps.green.spi

trait Discovery {
	def lookup(service:String):Seq[(String, Int)]
	def register(id:String, service:String, ip:String, port:Int):Unit
	def deregister(id:String):Unit
}
