import React from 'react'

export default function ModelWindow(prop) {

    const styles = {
        popup:{
          display:"show",
          opacity:"0"
        }
      };

    return (
        <div>
            <h4 style={{color:'orange'}}>Test</h4>
            <div id="myModal" className="modal fade" style={{display:'none'}} tabIndex="-2">
                <div className="modal-dialog">
                    <div className="modal-content">
                        <div className="modal-header">
                            <h5 className="modal-title">Confirmation</h5>
                            <button type="button" className="btn-close" data-bs-dismiss="modal"></button>
                        </div>
                        <div className="modal-body">
                            <p>Do you want to save changes to this document before closing?</p>
                            <p className="text-secondary"><small>If you don't save, your changes will be lost.</small></p>
                        </div>
                        <div className="modal-footer">
                            <button type="button" className="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                            <button type="button" className="btn btn-primary">Save changes</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}
