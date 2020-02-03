import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserService } from '../service/user.service';
// import { ToastsManager } from 'ng2-toastr/ng2-toastr';
import { ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  userList: any;
  displayData: boolean = false;
  // userModel1= this.userModel1 ;
  constructor(private  userService: UserService, private router: Router, private toastr: ToastrService) { }
  model: any = {
    fname: '',
    lname: '',
    phone: '',
    exp: '',
    email: ''
  };

  ngOnInit() {
    this.getAllUsers();
  }


  getAllUsers() {
    this.userService.getAllUsers()
      .subscribe(
        data => {
          this.userList = data;
        }
      );
  }

  delete(user: any) {
    this.userService.deleteUser(user.id).subscribe(
      data => console.log(data)
    );
    this.getAllUsers();
  }

  update(user: any) {
    this.userService.updateUser(user.id, user).subscribe(
      data => console.log(data)
    );
  }
  editUser(user: User): void {
    localStorage.removeItem('id');
    localStorage.setItem('id', user.id.toString());
    this.router.navigate(['edituser']);
  }

  saveUser(model) {
    console.log(model);
    this.userService.saveUser(model).subscribe(
      data => console.log(JSON.stringify(data))
    );
    //this.userService.getAllUsers();
    this.resetUser();
    this.toastr.success('Record Added');
    //this.getAllUsers();
  }
  resetUser() {
    this.model = {};
  }

  view() {
    this.displayData = true;
  }
}
