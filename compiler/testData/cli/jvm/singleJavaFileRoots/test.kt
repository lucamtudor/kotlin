import lib.*
import lib.ext.*

fun main(args: Array<String>) {
    A().b()
    B().c()
    C().a()

    DefaultPackage()

    PackageLocal1()
    PackageLocal2()
}
