# Lumo + ShellJS Error Repro

### Steps:

1. Clone this repo

2. Run `npm install`

3. Run `npm start`

4. Observe the following error:

```
> lumo-shelljs-repro@1.0.0 start /home/daviwil/Projects/Code/lumo-shelljs-repro
> lumo repro.cljs

WARNING: Use of undeclared Var cljs.user/var at line 1 
WARNING: Use of undeclared Var cljs.user/child at line 1 
WARNING: Can't take value of macro cljs.core/require at line 1 
WARNING: Use of undeclared Var cljs.user/fs at line 2 
WARNING: Can't take value of macro cljs.core/require at line 2 
WARNING: Use of undeclared Var cljs.user/var at line 3 
WARNING: Use of undeclared Var cljs.user/childProcess at line 3 
           ⬆
/tmp/shelljs_2b64e6d0015dc597a80c [line 3, col 78] Invalid keyword: :. at line 3 /tmp/shelljs_2b64e6d0015dc597a80c
         (new)
         Function.cljs.core.ex_info.cljs$core$IFn$_invoke$arity$3 (NO_SOURCE_FILE <embedded>:1928:72)
         Function.cljs.core.ex_info.cljs$core$IFn$_invoke$arity$2 (NO_SOURCE_FILE <embedded>:1927:449)
         Function.cljs.tools.reader.impl.errors.throw_ex.cljs$core$IFn$_invoke$arity$variadic (NO_SOURCE_FILE <embedded>:2095:303)
         Function.cljs.tools.reader.impl.errors.reader_error.cljs$core$IFn$_invoke$arity$variadic (NO_SOURCE_FILE <embedded>:2098:141)
         Object.cljs.tools.reader.impl.errors.throw_invalid (NO_SOURCE_FILE <embedded>:2113:365)
         cljs.tools.reader.read_keyword (NO_SOURCE_FILE <embedded>:2197:405)
         Object.cljs.tools.reader.read_STAR__internal (NO_SOURCE_FILE <embedded>:2269:407)
         Function.cljs.tools.reader.read_STAR_.cljs$core$IFn$_invoke$arity$6 (NO_SOURCE_FILE <embedded>:2272:111)
         Object.cljs.tools.reader.read_delimited_internal (NO_SOURCE_FILE <embedded>:2171:427)

exec: internal error
```
