import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-newemployee',
  template: `
  <body style="background-color:		#daa520">
  
  <section id="cover" class="min-vh-100">
    <div id="cover-caption">
        <div class="container">
            <div class="row text-white">
                <div class="col-xl-5 col-lg-6 col-md-8 col-sm-10 mx-auto text-center form p-4">
                    <h6 class="display-4 py-2 text-truncate"></h6>
                    <h5>NEW EMPLOYEE FORM</h5>
                    <div class="px-2">
                        <form action="/home" class="justify-content-center">
                            <div class="form-group">
                                <label class="sr-only">Name</label>
                                <input type="text" class="form-control" placeholder="name">
                            </div>
                            <div class="form-group">
                                <label class="sr-only">Email</label>
                                <input type="text" class="form-control" placeholder="email">
                            </div>
                            <div class="form-group">
                            <label class="sr-only">Number</label>
                            <input type="text" class="form-control" placeholder="number">
                        </div>
                        <div class="form-group">
                        <label class="sr-only">Department</label>
                        <input type="text" class="form-control" placeholder="department">
                    </div>
                    <div class="form-group">
                    <label class="sr-only">Place</label>
                    <input type="text" class="form-control" placeholder="place">
                </div>
                            <button type="submit" class="btn btn-primary btn-lg">SUBMIT</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
  `,
  styles: [ `#cover {
    background: #222 ) center center no-repeat;
    background-size: cover;
    height: 90%;
    text-align: center;
    display: flex;
    align-items: center;
    position: relative;
}

#cover-caption {
    width: 100%;
    position: relative;
    z-index: 1;
}

/* only used for background overlay not needed for centering */
form:before {
    content: '';
    height: 100%;
    left: 0;
    position: absolute;
    top: 0;
    width: 100%;
    background-color: rgba(0,0,0,0.3);
    z-index: -1;
    border-radius: 10px;
}`
  ]
})
export class NewemployeeComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
