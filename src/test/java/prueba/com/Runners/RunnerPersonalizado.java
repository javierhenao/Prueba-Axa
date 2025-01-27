package prueba.com.Runners;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;
import net.serenitybdd.cucumber.CucumberWithSerenity;

public class RunnerPersonalizado extends Runner {
            
       private Class<CucumberWithSerenity> classValue;
       private CucumberWithSerenity cucumberWithSerenity;
       
        
        public RunnerPersonalizado(Class<CucumberWithSerenity> classValue) throws Exception {
        	
        	System.out.println("RunnerPersonalizado constructor called with class: " + classValue.getName() + " ###PARA VERIFICAR####");
        	this.classValue = classValue;
        	cucumberWithSerenity = new CucumberWithSerenity(classValue);
           }
       
         @Override
           public Description getDescription() {
               return cucumberWithSerenity.getDescription();
           }
         
         private void runAnnotatedMethods(Class<?> annotation) throws Exception {
               if (!annotation.isAnnotation()) {
                   return;
               }
               Method[] methods = this.classValue.getMethods();
               for (Method method : methods) {
                   Annotation[] annotations = method.getAnnotations();
                   for (Annotation item : annotations) {
                       if (item.annotationType().equals(annotation)) {
                           method.invoke(null);
                           break;
                       }
                   }
               }
         }
         
         @Override
           public void run(RunNotifier notifier) {
               try {
                   runAnnotatedMethods(prueba.com.utilidades.BeforeSuite.class);
                   cucumberWithSerenity = new CucumberWithSerenity(classValue);
               } catch (Exception e) {
                   e.printStackTrace();
               }
               cucumberWithSerenity.run(notifier);
           }
}

