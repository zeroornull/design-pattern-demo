package indi.zeroornull.pattern.chain_of_responsibility.pipeline;

import indi.zeroornull.pattern.chain_of_responsibility.pipeline.biz.BadLanguageHandler;
import indi.zeroornull.pattern.chain_of_responsibility.pipeline.biz.MessageHandler;
import indi.zeroornull.pattern.chain_of_responsibility.pipeline.biz.SpaceHandler;
import indi.zeroornull.pattern.chain_of_responsibility.pipeline.biz.UserMessage;
import indi.zeroornull.pattern.chain_of_responsibility.pipeline.jar.Pipeline;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PipelineTest {
    public static void main(String[] args) {
        Pipeline<String, UserMessage> steps = new Pipeline<>(new SpaceHandler())
                .addHandler(new BadLanguageHandler()) // 接管子，一节连着一节
                .addHandler(new MessageHandler());
        UserMessage userMessage = steps.execute("你是我日日夜夜思念的人");
        log.info(String.valueOf(userMessage));
    }
}
