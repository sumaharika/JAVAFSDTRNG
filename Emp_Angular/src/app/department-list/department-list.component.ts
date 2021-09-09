import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-department-list',
  template: `

  

<body style="background-color:		#daa520">
  
  <section id="cover" class="min-vh-100">
    <div id="cover-caption">
        <div class="container">
            <div class="row text-black">
                <div class="col-xl-5 col-lg-6 col-md-8 col-sm-10 mx-auto text-center form p-4">
                    <h1 class="display-4 py-2 text-truncate"></h1>
                    <div class="px-2">
                    <ul class="list-group list-group-flush"  style="background-color: #eee;">
                    <li class="list-group-item"  style="background-color: #eee;">Marketing</li>
                    <li class="list-group-item">Accounting</li>
                    <li class="list-group-item">Buisness Analyst</li>
                    <li class="list-group-item">Development</li>
                    <li class="list-group-item">Implementation</li>
                    <li class="list-group-item">Operation</li>
                    
                  </ul>
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
export class DepartmentListComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
