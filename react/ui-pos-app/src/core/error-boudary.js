import React, { Component } from 'react'

export default class ErrorBoundary extends Component {

    constructor(props) {
        super(props);
        console.log("==>CONSTRICTOR")
        this.state = { hasError: false };
    }

    static getDerivedStateFromError(error) {
        // Update state so the next render will show the fallback UI.
        console.log("==>getDerivedStateFromError(error)");
        return { hasError: true };
    }

    componentDidCatch(error, errorInfo) {
        // You can also log the error to an error reporting service
        //logErrorToMyService(error, errorInfo);
        console.log("==>componentDidCatch(error, errorInfo)");
        console.log(error + "," + errorInfo)
    }


    render() {
        console.log("==>render()");
        if (this.state.hasError) {
            // You can render any custom fallback UI
            return <h1>Something went wrong.</h1>;
        }

        return this.props.children;
    }
}
