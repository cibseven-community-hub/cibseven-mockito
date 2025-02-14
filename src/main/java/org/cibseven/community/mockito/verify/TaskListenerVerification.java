package org.cibseven.community.mockito.verify;

import static org.mockito.Mockito.verify;

import org.cibseven.bpm.engine.delegate.DelegateTask;
import org.cibseven.bpm.engine.delegate.TaskListener;
import org.mockito.verification.VerificationMode;

public class TaskListenerVerification extends AbstractMockitoVerification<TaskListener, DelegateTask> {

  public TaskListenerVerification(final TaskListener mock) {
    super(mock, DelegateTask.class);
  }

  @Override
  protected void doVerify(final VerificationMode verificationMode) throws Exception {
    verify(mock, verificationMode).notify(argumentCaptor.capture());
  }

}
