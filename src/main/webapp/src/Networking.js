import SwaggerClient from "swagger-client";

export default class Networking {
    static client = new SwaggerClient({
        url: 'http://localhost:8080/q/openapi'
    });
    static exec = ({endpoint, attributes, data, success, failure = res => console.log('failed on api call: ' + res)}) => {
        this.client.then(
            client => endpoint(client)(attributes, data),
            reason => {
                failure(reason);
                console.error('failed to load the spec: ' + reason)
            }
        ).then(success, failure);
    }
}