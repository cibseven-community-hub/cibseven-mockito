package org.cibseven.community.mockito.verify;

import org.cibseven.community.bpm.data.factory.VariableFactory;
import org.cibseven.bpm.engine.CaseService;
import org.mockito.Mockito;
import org.mockito.verification.VerificationMode;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Verification of mocked service.
 */
public class CaseServiceVerification {
  private final CaseService caseService;

  /**
   * Constructs the verification.
   *
   * @param caseService service mock.
   */
  public CaseServiceVerification(CaseService caseService) {
    this.caseService = caseService;
  }

  /**
   * Verifies if the variable has been retrieved from a global scope.
   *
   * @param variableFactory factory defining the variable.
   * @param executionId     execution id.
   * @param mode            mockito verification mode.
   * @param <T>             type of variable.
   */
  public <T> void verifyGet(VariableFactory<T> variableFactory, String executionId, VerificationMode mode) {
    verify(caseService, mode).getVariable(executionId, variableFactory.getName());
  }

  /**
   * Verifies if the variable has been retrieved from a global scope.
   *
   * @param variableFactory factory defining the variable.
   * @param executionId     execution id.
   * @param <T>             type of variable.
   */
  public <T> void verifyGet(VariableFactory<T> variableFactory, String executionId) {
    verifyGet(variableFactory, executionId, times(1));
  }

  /**
   * Verifies if the variable has been retrieved from a local scope.
   *
   * @param variableFactory factory defining the variable.
   * @param executionId     execution id.
   * @param mode            mockito verification mode.
   * @param <T>             type of variable.
   */
  public <T> void verifyGetLocal(VariableFactory<T> variableFactory, String executionId, VerificationMode mode) {
    verify(caseService, mode).getVariableLocal(executionId, variableFactory.getName());
  }

  /**
   * Verifies if the variable has been retrieved from a local scope.
   *
   * @param variableFactory factory defining the variable.
   * @param executionId     execution id.
   * @param <T>             type of variable.
   */
  public <T> void verifyGetLocal(VariableFactory<T> variableFactory, String executionId) {
    verifyGetLocal(variableFactory, executionId, times(1));
  }


  /**
   * Verifies if the variable has been set globally.
   * @param variableFactory factory defining the variable.
   * @param value value to set.
   * @param executionId execution id.
   * @param <T> type of variable.
   * @param mode verification mode.
   */
  public <T> void verifySet(VariableFactory<T> variableFactory, T value, String executionId, VerificationMode mode) {
    verify(caseService, mode).setVariable(executionId, variableFactory.getName(), variableFactory.on(caseService, executionId).getTypedValue(value, false));
  }

  /**
   * Verifies if the variable has been set globally.
   * @param variableFactory factory defining the variable.
   * @param value value to set.
   * @param executionId execution id.
   * @param <T> type of variable.
   */
  public <T> void verifySet(VariableFactory<T> variableFactory, T value, String executionId) {
    verifySet(variableFactory, value, executionId, times(1));
  }

  /**
   * Verifies if the variable has been set locally.
   * @param variableFactory factory defining the variable.
   * @param value value to set.
   * @param executionId execution id.
   * @param <T> type of variable.
   * @param mode verification mode.
   */
  public <T> void verifySetLocal(VariableFactory<T> variableFactory, T value, String executionId, VerificationMode mode) {
    verify(caseService, mode).setVariableLocal(executionId, variableFactory.getName(), variableFactory.on(caseService, executionId).getTypedValue(value, false));
  }

  /**
   * Verifies if the variable has been set locally.
   * @param variableFactory factory defining the variable.
   * @param value value to set.
   * @param executionId execution id.
   * @param <T> type of variable.
   */
  public <T> void verifySetLocal(VariableFactory<T> variableFactory, T value, String executionId) {
    verifySetLocal(variableFactory, value, executionId, times(1));
  }

  /**
   * Verifies if the variable has been removed from a global scope.
   * @param variableFactory factory defining the variable.
   * @param executionId execution id.
   * @param <T> type of variable.
   * @param mode verification mode.
   */
  public <T> void verifyRemove(VariableFactory<T> variableFactory, String executionId, VerificationMode mode) {
    verify(caseService, mode).removeVariable(executionId, variableFactory.getName());
  }

  /**
   * Verifies if the variable has been removed from a global scope.
   * @param variableFactory factory defining the variable.
   * @param executionId execution id.
   * @param <T> type of variable.
   */
  public <T> void verifyRemove(VariableFactory<T> variableFactory, String executionId) {
    verify(caseService).removeVariable(executionId, variableFactory.getName());
  }

  /**
   * Verifies if the variable has been removed from a local scope.
   * @param variableFactory factory defining the variable.
   * @param executionId execution id.
   * @param <T> type of variable.
   * @param mode verification mode.
   */
  public <T> void verifyRemoveLocal(VariableFactory<T> variableFactory, String executionId, VerificationMode mode) {
    verify(caseService, mode).removeVariableLocal(executionId, variableFactory.getName());
  }

  /**
   * Verifies if the variable has been removed from a local scope.
   * @param variableFactory factory defining the variable.
   * @param executionId execution id.
   * @param <T> type of variable.
   */
  public <T> void verifyRemoveLocal(VariableFactory<T> variableFactory, String executionId) {
    verify(caseService).removeVariableLocal(executionId, variableFactory.getName());
  }

  /**
   * Verifies retrieval of all process variables.
   * @param executionId execution id.
   */
  public void verifyGetVariables(String executionId) {
    verify(caseService).getVariables(executionId);
  }

  /**
   * Verifies retrieval of all process variables.
   * @param executionId execution id.
   * @param mode verification mode.
   */
  public void verifyGetVariables(String executionId, VerificationMode mode) {
    verify(caseService, mode).getVariables(executionId);
  }

  /**
   * No further interaction with mock.
   */
  public void verifyNoMoreInteractions() {
    Mockito.verifyNoMoreInteractions(caseService);
  }

}
