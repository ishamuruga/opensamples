import {BehaviorSubject} from "rxjs";

const initValues = {
    data:"",
    ts:new Date(),
    event:"EVT_NONE"
};

const subscriber = new BehaviorSubject(initValues);

const MessageService = {
    send : (_event,_payload) => {
        subscriber.next({
            data:_payload,
            event:_event,
            ts: new Date()
        })
    },
    receive : () =>{
        return subscriber.asObservable();
    },
    clear : () => {
        subscriber.next(initValues);
    }
}

export {MessageService};