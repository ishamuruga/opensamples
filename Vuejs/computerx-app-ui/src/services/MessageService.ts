import { BehaviorSubject } from "rxjs";

type PayLoad = {
    payload: any,
}

class MessageService {

    private static instance: MessageService
    private constructor() {
        console.log('Singleton instance created.');
    }
    public static getInstance(): MessageService {
        if (!MessageService.instance) {
            MessageService.instance = new MessageService();
        }
        return MessageService.instance;
    }

    sub: BehaviorSubject<any> = new BehaviorSubject({
        payload: null,
    });

    sendMessage(pl: any, event: string) {
        this.sub.next({
            p: pl,
            e: event,
            ts: new Date()
        });
    }

    listener() {
        return this.sub.asObservable();
    }

    reset() {
        this.sub.next({})
    }
}

export default MessageService;