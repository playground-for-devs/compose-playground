package de.jensklingenberg.ccrit

import androidx.compose.Composable
import com.google.auto.service.AutoService
import javax.annotation.processing.AbstractProcessor
import javax.annotation.processing.Processor
import javax.annotation.processing.RoundEnvironment
import javax.lang.model.SourceVersion
import javax.lang.model.element.Element
import javax.lang.model.element.TypeElement


@AutoService(Processor::class)
class ComposeProcessor : AbstractProcessor() {

    companion object {
        const val KAPT_KOTLIN_GENERATED_OPTION_NAME = "kapt.kotlin.generated"
    }

    private var annotatedFunctionsList: ArrayList<Element> = arrayListOf()

    override fun getSupportedAnnotationTypes(): MutableSet<String> = mutableSetOf(Composable::class.java.name)

    override fun getSupportedSourceVersion(): SourceVersion = SourceVersion.latest()



    override fun process(set: MutableSet<out TypeElement>, roundEnv: RoundEnvironment): Boolean {
        roundEnv.getElementsAnnotatedWith(Composable::class.java)
            .forEach {
                annotatedFunctionsList.add(it)
            }

        if (roundEnv.processingOver()) {

            val i = 1

        }
        return true
    }
}

