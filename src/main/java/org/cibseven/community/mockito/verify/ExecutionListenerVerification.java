package org.cibseven.community.mockito.verify;

import static org.mockito.Mockito.verify;

import org.cibseven.bpm.engine.delegate.DelegateExecution;
import org.cibseven.bpm.engine.delegate.ExecutionListener;
import org.mockito.verification.VerificationMode;

public class ExecutionListenerVerification extends AbstractMockitoVerification<ExecutionListener, DelegateExecution> {

  public ExecutionListenerVerification(final ExecutionListener mock) {
    super(mock, DelegateExecution.class);
  }

  @Override
  protected void doVerify(final VerificationMode verificationMode) throws Exception {
    verify(mock, verificationMode).notify(argumentCaptor.capture());
  }

}
