/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class ParseContext {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected ParseContext(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ParseContext obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_ParseContext(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ParseContext() {
    this(AdaptiveCardObjectModelJNI.new_ParseContext__SWIG_0(), true);
  }

  public ParseContext(ElementParserRegistration elementRegistration, ActionParserRegistration actionRegistration, SWIGTYPE_p_std__shared_ptrT_std__unordered_setT_std__string_t_t elementIds) {
    this(AdaptiveCardObjectModelJNI.new_ParseContext__SWIG_1(ElementParserRegistration.getCPtr(elementRegistration), elementRegistration, ActionParserRegistration.getCPtr(actionRegistration), actionRegistration, SWIGTYPE_p_std__shared_ptrT_std__unordered_setT_std__string_t_t.getCPtr(elementIds)), true);
  }

  public ParseContext(ElementParserRegistration elementRegistration, ActionParserRegistration actionRegistration) {
    this(AdaptiveCardObjectModelJNI.new_ParseContext__SWIG_2(ElementParserRegistration.getCPtr(elementRegistration), elementRegistration, ActionParserRegistration.getCPtr(actionRegistration), actionRegistration), true);
  }

  public void setElementParserRegistration(ElementParserRegistration value) {
    AdaptiveCardObjectModelJNI.ParseContext_elementParserRegistration_set(swigCPtr, this, ElementParserRegistration.getCPtr(value), value);
  }

  public ElementParserRegistration getElementParserRegistration() {
    long cPtr = AdaptiveCardObjectModelJNI.ParseContext_elementParserRegistration_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ElementParserRegistration(cPtr, true);
  }

  public void setActionParserRegistration(ActionParserRegistration value) {
    AdaptiveCardObjectModelJNI.ParseContext_actionParserRegistration_set(swigCPtr, this, ActionParserRegistration.getCPtr(value), value);
  }

  public ActionParserRegistration getActionParserRegistration() {
    long cPtr = AdaptiveCardObjectModelJNI.ParseContext_actionParserRegistration_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ActionParserRegistration(cPtr, true);
  }

  public void setElementIds(SWIGTYPE_p_std__shared_ptrT_std__unordered_setT_std__string_t_t value) {
    AdaptiveCardObjectModelJNI.ParseContext_elementIds_set(swigCPtr, this, SWIGTYPE_p_std__shared_ptrT_std__unordered_setT_std__string_t_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__shared_ptrT_std__unordered_setT_std__string_t_t getElementIds() {
    long cPtr = AdaptiveCardObjectModelJNI.ParseContext_elementIds_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__shared_ptrT_std__unordered_setT_std__string_t_t(cPtr, false);
  }

  public void setWarnings(AdaptiveCardParseWarningVector value) {
    AdaptiveCardObjectModelJNI.ParseContext_warnings_set(swigCPtr, this, AdaptiveCardParseWarningVector.getCPtr(value), value);
  }

  public AdaptiveCardParseWarningVector getWarnings() {
    long cPtr = AdaptiveCardObjectModelJNI.ParseContext_warnings_get(swigCPtr, this);
    return (cPtr == 0) ? null : new AdaptiveCardParseWarningVector(cPtr, false);
  }

}