import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { EdituserComponent } from './edituser/edituser.component';

const routes: Routes = [{path: '', redirectTo: '/dashboard', pathMatch: 'full' },
                         {path: 'edituser', component: EdituserComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
