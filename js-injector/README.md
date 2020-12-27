# Injector

Tool for implementing our API by reading the cleaned gamepack

[js-injector](injector.py) - Read classes from mobile-runescape-client and writes corresponding js classes in frida-scripts/api.

Each js class extends same classes as the original client but the unextended classes extends Interceptor instead.
Interceptor exposes unified interfaces for instrumenting Java classes. We can modify the injector to add new features that might be useful for the development of plugins 

Usage:

`python injector.py`