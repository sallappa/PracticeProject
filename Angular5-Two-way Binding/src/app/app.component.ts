import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: '.<ChildComponent></ChildComponent>',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
    public cdata: string | undefined;
}

