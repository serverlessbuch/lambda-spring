package de.serverlessbuch.lambda;

import com.amazonaws.serverless.exceptions.ContainerInitializationException;
import com.amazonaws.serverless.proxy.internal.model.AwsProxyRequest;
import com.amazonaws.serverless.proxy.internal.model.AwsProxyResponse;
import com.amazonaws.serverless.proxy.spring.SpringLambdaContainerHandler;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import de.serverlessbuch.spring.SpringAppConfig;

/**
 * @author Niko Köbler, http://www.n-k.de, @dasniko
 */
public class LambdaHandler implements RequestHandler<AwsProxyRequest, AwsProxyResponse> {

    private SpringLambdaContainerHandler<AwsProxyRequest, AwsProxyResponse> handler;
    private boolean isInitialized = false;

    public AwsProxyResponse handleRequest(AwsProxyRequest awsProxyRequest, Context context) {
        if (!isInitialized) {
            try {
                handler = SpringLambdaContainerHandler.getAwsProxyHandler(SpringAppConfig.class);
                isInitialized = true;
            } catch (ContainerInitializationException e) {
                e.printStackTrace();
                return null;
            }
        }
        return handler.proxy(awsProxyRequest, context);
    }

}
