import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee-list',
  template: `
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<body style="background-color:		#daa520">
  
  <section id="cover" class="min-vh-100">
    <div id="cover-caption">
        <div class="container">
            <div class="row text-black">
                <div class="col-xl-8 col-lg-6 col-md-8 col-sm-10 mx-auto text-center form p-4">
                    <h1 class="display-4 py-2 text-truncate"></h1>
                    <div class="px-2">
                    <table class="table table-sm center table-bordered " style="background-color:		white">
  <thead>
    <tr>
      <th class="w-15" scope="col">#</th>
      <th class="w-15" scope="col">First</th>
      <th  class="w-15" scope="col">Last</th>
      <th class="w-15" scope="col">Email</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>ALONA</td>
      <td>GEORGE</td>
      <td>alona@gmail.com</td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>adona</td>
      <td>george</td>
      <td>adona@gmail.com</td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>Happy</td>
      <td>George</td>
      <td>happy@gmail.com</td>
    </tr>
  </tbody>
</table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
  `,
  styles: [
    
  ]
})
export class EmployeeListComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
