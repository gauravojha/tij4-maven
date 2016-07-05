//: annotations/InterfaceExtractorProcessorFactory.java
// APT-based annotation processing.
package annotations;
import javax.annotation.processing.*;
import javax.lang.model.element.TypeElement;
import java.util.*;

public class InterfaceExtractorProcessorFactory
  implements Processor {
  public Processor getProcessorFor(
    Set<TypeElement> atds,
    ProcessingEnvironment env) {
    return new InterfaceExtractorProcessor(env);
  }
  public Collection<String> supportedAnnotationTypes() {
    return
     Collections.singleton("annotations.ExtractInterface");
  }
  public Collection<String> supportedOptions() {
    return Collections.emptySet();
  }
} ///:~
