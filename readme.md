Test 1:
1. What set of commands are executed to push a repo on Github?
cd /path
git add file
git commit -d "message"
git push

2. Where the strings.xml in the project structure?
/app/res/values/strings.xml

3. What is the difference between SP and DP?
dp are relative pixels on the screen
sp also like dp but is scaled to user's font size

4. How can you support multiple languages in your app? Explain step by step process.
1--- Right click values
2--- New resource file
3--- Name of the new file (has to be the same of the main strings file strings.xml)
4--- move the locale option to right
5--- select the languaje
6--- open the new languaje file on strings and you have to put the same tags than in your original file but changing the languaje manually or request to someone in the web to translate the file for you (it has a cost)

5. What is the difference between match_parent and wrap_content?
match_parent takes all the size of his parent
wrapt_content takes all the size of the content that he has inside

6. How can you setup a method for a button click without binding the view?
in the layout file where the button is add the tag

android:onClick="nameofmethod"

press alt + enter and enter again and it will be created the method in the java class associated

7. How can you define a button click method with binding the button view?
We have to find the btn in the Oncreate method of java
for example

Button btn = (Button) finViewById(R.id.btn);

then we have to put the click event
btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //doSomething
            }
        });

8. How can you change the color of the TextView?
In the xml layout where is located the TextView add this line to the properties
android:textColor:"#ffffff" or android:textColor:"@color/primary"

In the second option you have to define the reference @color/primary in the color.xml located in /app/res/values/colors.xml

9. Where are all the colors in the android architecture saved?
in /app/res/values/colors.xml

10. How would you add a different layout for a landscape and a language? Name the qualifiers.
1--- Right click layout
2--- Layout resource file
3--- Name of the new file (has to be the same of the main layout file)
4--- Orientation
5--- Select landscape
6--- Click OK

1--- Right click layout
2--- Layout resource file
3--- Name of the new file (has to be the same of the main layout file)
4--- move the locale option to right
5--- select the languaje
6--- Click OK

11. How would you make the keyboard hide for EditText when the activity is created?
Adding this line in OnCreate methos in the activity that is opened
this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

12. What are ViewGroups and Views?
View objects are the basic building blocks of User Interface(UI) elements in Android.
View is a simple rectangle box which responds to the user's actions.
Examples are EditText, Button, CheckBox etc..
View refers to the android.view.View class, which is the base class of all UI classes.

ViewGroup is the invisible container. It holds View and ViewGroup
For example, LinearLayout is the ViewGroup that contains Button(View), and other Layouts also.
ViewGroup is the base class for Layouts.

13. What attribute is necessary in a linear layout if there are more than one child views?
android:orientation"vertical" or android:orientation"horizontal"

14. In which case you would use a Linear layout and a Relative layout?
LinearLayout is used when we want to put the elements in a single line vertical/horizontal
RelativeLayout is used when we want to put the elements at right/bottom/top/left of other element

15. How would you load an image in a ImageView from xml and programmatically?
You have to put the image in the drawable folder then

In xml file
put the tag android:src="@drawable/img"

progammatically in java class
imageView.setImageResource(resId);

16. List all the states in an activity lifecycle.
OnCreate
OnStart
OnResume
OnPause
OnStop
OnDestroy
OnRestart

17. What is the lifecycle of activity one and activity two when we go to activity one from two?
First Activity
onCreate()
onStart()
onResume()
onPause()

Second activity
onCreate()
onStart()
onResume()

18. How to restrict an activity from changing the orientation?
Adding this tags inside your activity in manifest.xml

android:screenOrientation="portrait"
    android:configChanges="keyboardHidden|orientation|screenSize"

19. Which method is called to persist the data before the activity is destroyed?
onSaveInstanceState

20. What is the argument of that method?
Bundle outState

21. How do we save the data in the method?
savedInstanceState.putString("key","value");

22. How to get that data back? What is the name of the method?
onRestoreInstanceState

23. What is a bundle? What can a bundle contain?
Bundles are generally used for passing data between various Android activities. It depends on you what type of values you want to pass, but bundles can hold all types of values and pass them to the new activity.
Almost everything we used to store data and the data can be a String, object, boolean, int, char,CharSequense, double, float, byte, long, Parcealable, Serializable.

24. What is the difference between onPause and onStop?
Paused – An activity is in a paused state when the activity is visible but not in focus.
Stopped – An activity is in a stopped state when it’s no longer visible. It is still in memory, but it could be destroyed by the android runtime, as “stopped” activities are generally considered low priority.

25. How to start an activity for getting a result back?
With an intent, for example:

Intent pickContactIntent = new Intent(Intent.ACTION_PICK, Uri.parse("content://contacts"));
pickContactIntent.setType(Phone.CONTENT_TYPE); // Show user only contacts w/ phone numbers
startActivityForResult(pickContactIntent, PICK_CONTACT_REQUEST);

26. Which callback is used get the result back in the above case?
Is used onActivityResult to get the result back

Example:

@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    // Check which request we're responding to
    if (requestCode == PICK_CONTACT_REQUEST) {
        // Make sure the request was successful
        if (resultCode == RESULT_OK) {
            // The user picked a contact.
            // The Intent's data Uri identifies which contact was selected.

            // Do something with the contact here (bigger example below)
        }
    }
}

27. What are difference types of Intent? What are the difference between them? When do we use each of them?
Implicit and explicit
implicit is the one that we used to call another activities and pass data
explicit intent is used to send actions, not need to put the class where we are going to send the data because is explicit, you have to say what would be the data passed (ex txt) and you can select what do you want to use to handle that (notes, copy to clipboard, drive, blueotooth, email, etc.).

28. How to communicate data between activities?
Using intents to pass parameters between each activity

29. How to add data to an intent?
Example for a string

Intent intent = new Intent(getActivity(),SecondActivity.class);
intent.putExtra(getString(R.string.KEY1), personW1D41);
startActivity(intent);

30. What kind of data can be added to an intent?
Almost everything we can add a String, bundle, object, boolean, int, char,CharSequense, double, float, byte, long, Parcealable, Serializable.

31. How to get the data sent from activity one in activity two?
For example for a string

Intent intent = getIntent();
intent.getStringExtra(getString(R.string.KEY_VALUE1))

32. What is context?
As the name suggests, it's the context of current state of the application/object.
It lets newly-created objects understand what has been going on.
Typically you call it to get information regarding another part of your program (activity and package/application).

You can get the context by invoking getApplicationContext(), getContext(), or this (when in a class that extends from Context, such as the Application, Activity, AppCompatActivity).

33. Name different kinds of layouts in Android?
LinearLayout, RelativeLayout, FrameLayout, ConstraintLayout, GridLayout, TableLayout

34. How to send an object through an Intent?
Creates the Object class with getters and setters and constructor
make an instace of that object ex

Person person = new Person(personName,personGender);

create the intent and pass it as a putExtra element

Intent intent = new Intent(getActivity(),SecondActivityclass);
intent.setAction("sendingPerson");
intent.putExtra(getString(R.string.KEY1), personW1D41);
startActivity(intent);

35. What is Serializable?
Serializable is a standard Java interface. The problem with this approach is that reflection is used and it is a slow process. This method create a lot of temporary objects and cause quite a bit of garbage collection.

36. What is Parcelable?
Interface for classes whose instances can be written to and restored from a Parcel.
Parcelable process is much faster than serializable.

37. Which is better and why?
In java serializable trasform the characters to bytecode make a copy of everything but in parsealable we make a parser only not a copy, that's the reason because parcealable is much faster.

38. How can an object class be Serializable or Parcelable? Explain in detail the methods to implement if any?
In the first one we have to create an object class and make an extent of Serializable and put the getters and setters
Then to receive the data we use getSerializableExtra(key);

In the second one we have to create an object class and make an extent of Parcelable and put the getters and setters
Then to receive the data we use getParcelableExtra(key);

39. Can we avoid implementing methods using Parcelable?
No, you have to use all the methods inside the Parcealable class.

40. What are launch modes? Explain each one of them in detail.
Launch modes are the way to manage the back stack when we return to previous activities, we have 3 differents launch modes

Standard
The one that is the default launch mode where all the activities/fragments are stored in the backstack and every time we press back we are returning to the previous activity/fragment no matter if is the same where we at

Single Top
This launche mode replaces the last element of the stack if is the same that the one that will be Inserted
an Example is
A->B->C->A->A in single top would be A->B->C->A only

Single Task
A single task eliminates the coincidence no matter the possition and put it on the top of the stack only if the one that will be inserted already exists
Example
A->B->C->B in single task would be A->C->B

SingleInstance
This mode is quite close to singleTask, only single instance of Activity could be existed in the system.
The difference is Task hold this Activity could have only one Activity, the singleInstance one.
If another Activity is called from this kind of Activity, a new Task would be automatically created to place that new Activity.
Likewise, if singleInstance Activity is called, new Task would be created to place the Activity.

41. What is back stack?
Is the stack that contains the previous activities/fragments, we can use it to return to the previous activities in different manners depending of the launch mode that we choose.

42. How to we create a .apk file?
Go to Build -> Build APK

43. How to create and signed .apk file
Go to Build -> Generate singed aplk
We need to have our keys and put the keys in the fields where needed.
