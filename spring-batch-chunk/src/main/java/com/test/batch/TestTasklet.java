package com.test.batch;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class TestTasklet implements Tasklet {

	private boolean fail = false;

	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1)
			throws Exception {

		if (!fail) {
			System.out.println("Finished sucessfully");
			return RepeatStatus.FINISHED;
		} else {
			System.out.println("Exception... So rollback should take place");
			return RepeatStatus.FINISHED;
		}
	}

	public boolean isFail() {
		return fail;
	}

	public void setFail(boolean fail) {
		this.fail = fail;
	}

}
