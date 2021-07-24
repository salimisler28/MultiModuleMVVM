import kotlin.reflect.full.declaredMemberProperties

object Modules {
    val app = ":app"
    val data = ":data"
    val domain = ":domain"
    val common = ":common"

    fun getAllModules() = this::class.declaredMemberProperties
}