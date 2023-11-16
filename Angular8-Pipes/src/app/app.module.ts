import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MyCustomPipe } from './my-custom.pipe';
import { ConvertToSpacesPipe } from 'src/app/products/convert-to-spaces.pipe';

@NgModule({
  declarations: [
    AppComponent,
    MyCustomPipe,
    ConvertToSpacesPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
